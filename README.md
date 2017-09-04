# 说明
 * 创建于 2017-09-04
 * 是一个生成单号的工程 由mang-sn工程演化而来
 * 因mang-sn是基于注解的工程 使用spring4+hibernate4 但在其他工程中有可能使用的是spring3+hibernate3 并且使用的是xml配置 所以我想开发一个适配这种工程的单号程序
 * 支持oracle、mysql数据库,使用for update语句保证计数不重复
 * 支持4种形式的计数方式 常用的是 每天从1开始 其他类型参见表注释
 * 提供几个简单的单号生成类 也可自已实现接口生成自定义的单号

# history
## 0.0.2-SNAPSHOT
* 第一版本 基于mang-sn-0.0.2版本开发 基于spring3+hibernate3 
