druid数据库连接池设置泄露连接检测，可以及时释放因异常导致应被释放但未被释放的连接。

在DruidProperties.java类中添加以下两个属性：

```
datasource.setRemoveAbandoned(true);
datasource.setRemoveAbandonedTimeoutMillis(60000);
```
