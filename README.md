# ERP
ERP系统（订单,库存,加工）

2015-3-3 15:15
   基础框架加入完成

2015-03-12
问题：
1、菜单的展示，菜单表
2、按照权限展示菜单，权限表
3、权限更新后缓存的同步更新问题
4、用户修改密码后，缓存同步更新问题

产品结构维护
1、保存后产品编码的不能修改
2、字段显示的补全(去除库存位号的展示)
3、弹出框必填的控制
4、添加产品结构的控制，防止添加上级死循环
	4.1、不能添加本身
	4.2、不能添加同一层级中已经存在的
	4.3、不能添加直系的祖先
5、添加替代料的控制，防止添加本身以及上级
	5.1、不能添加本身
	5.2、不能添加上级
	5.3、不能添加同一层级中已经存在的
6、产品审核的控制，控制后不能修改,且生效状态为已生效
7、计算成本

采购需求清单
1.采购需求清单需要关联查询已下订单数量和已入库数量(重要)
 1.1在主线程里，向BlockingQueue添加对象，这个过程是即时返回的，不会阻塞。
    然后另外启动一个线程专门读取BlockingQueue的对象，进行处理，一旦队列里没有新对象，这个线程会自动阻塞到有新的对象加入到队列为止。