import request from '@/utils/request'

// 客户 VO
export interface CustomerVO {
  id: number // ID
  name: string // 客户名称
  mobile: string // 手机
  telephone: string // 电话
  dealStatus: number // 成交状态0未成交1成交
  dealTime: number // 成交时间
  isLock: boolean // 1锁定
  level: number // 客户级别ID
  industry: number // 客户行业ID
  tags: string //  客户标签
  source: number // 客户来源ID
  remark: string // 备注
  userId: number // 前台用户ID
  province: number // 省份id
  city: number // 城市ID
  area: number // 区域ID
  detailAddress: string // 详细地址
  lng: number // 地理位置经度
  lat: number // 地理位置维度
  nextTime: Date // 下次联系时间
  followTime: Date // 最后跟进时间
  collectTime: Date // 领取时间
  weixin: string // 微信
  qq: number // QQ
  purchaseTotal: number // 消费总额
  purchaseTimes: number // 消费次数
  followStatus: string // 跟进状态
}


// 客户分页查询
export function getJob(CustomerVO) {
  return request({
    url: '/crm/customer/list/',
    method: 'get',
    data: CustomerVO
  })
}

