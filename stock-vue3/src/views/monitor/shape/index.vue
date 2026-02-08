<template>
  <div class="snake-game">
    <div class="game-board">
      <div
        v-for="(row, y) in board"
        :key="y"
        class="row"
      >
        <div
          v-for="(cell, x) in row"
          :key="x"
          class="cell"
          :class="{ snake: cell === 1, food: cell === 2 }"
        ></div>
      </div>
    </div>
    <div class="score">Score: {{ score }}</div>
    <button @click="resetGame">Reset Game</button>
  </div>
</template>

<script>
import { ref, onMounted, onUnmounted } from 'vue';

export default {
  name: 'SnakeGame',
  setup() {
    const boardSize = 20;
    const board = ref(Array.from({ length: boardSize }, () => Array.from({ length: boardSize }, () => 0)));
    const snake = ref([{ x: 10, y: 10 }]);
    const direction = ref({ x: 0, y: 0 });
    const food = ref({ x: 5, y: 5 });
    const score = ref(0);
    const gameInterval = ref(null);

    const generateFood = () => {
      let newFood;
      do {
        newFood = {
          x: Math.floor(Math.random() * boardSize),
          y: Math.floor(Math.random() * boardSize),
        };
      } while (snake.value.some(segment => segment.x === newFood.x && segment.y === newFood.y));
      food.value = newFood;
    };

    const updateBoard = () => {
      const newBoard = Array.from({ length: boardSize }, () => Array.from({ length: boardSize }, () => 0));
      snake.value.forEach(segment => {
        newBoard[segment.y][segment.x] = 1;
      });
      newBoard[food.value.y][food.value.x] = 2;
      board.value = newBoard;
    };

    const moveSnake = () => {
      const head = { ...snake.value[0] };
      head.x += direction.value.x;
      head.y += direction.value.y;

      if (head.x < 0 || head.x >= boardSize || head.y < 0 || head.y >= boardSize || snake.value.some(segment => segment.x === head.x && segment.y === head.y)) {
        resetGame();
        return;
      }

      snake.value.unshift(head);

      if (head.x === food.value.x && head.y === food.value.y) {
        score.value += 1;
        generateFood();
      } else {
        snake.value.pop();
      }

      updateBoard();
    };

    const resetGame = () => {
      snake.value = [{ x: 10, y: 10 }];
      direction.value = { x: 0, y: 0 };
      score.value = 0;
      generateFood();
      updateBoard();
    };

    const handleKeyDown = (event) => {
      switch (event.key) {
        case 'ArrowUp':
          if (direction.value.y === 0) direction.value = { x: 0, y: -1 };
          break;
        case 'ArrowDown':
          if (direction.value.y === 0) direction.value = { x: 0, y: 1 };
          break;
        case 'ArrowLeft':
          if (direction.value.x === 0) direction.value = { x: -1, y: 0 };
          break;
        case 'ArrowRight':
          if (direction.value.x === 0) direction.value = { x: 1, y: 0 };
          break;
      }
    };

    onMounted(() => {
      generateFood();
      updateBoard();
      gameInterval.value = setInterval(moveSnake, 200);
      window.addEventListener('keydown', handleKeyDown);
    });

    onUnmounted(() => {
      clearInterval(gameInterval.value);
      window.removeEventListener('keydown', handleKeyDown);
    });

    return {
      board,
      score,
      resetGame,
    };
  },
};
</script>

<style scoped>
.snake-game {
  display: flex;
  flex-direction: column;
  align-items: center;
}

.game-board {
  display: grid;
  grid-template-rows: repeat(20, 20px);
  grid-template-columns: repeat(20, 20px);
  gap: 1px;
}

.row {
  display: flex;
}

.cell {
  width: 20px;
  height: 20px;
  background-color: #eee;
}

.snake {
  background-color: green;
}

.food {
  background-color: red;
}

.score {
  margin-top: 20px;
  font-size: 24px;
}

button {
  margin-top: 20px;
  padding: 10px 20px;
  font-size: 16px;
}
</style>