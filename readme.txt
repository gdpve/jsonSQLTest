demo的作用：
1.FastJson对于JSON格式字符串、JSON对象及JavaBean之间的相互转换
2.读取本地文件
3.原始的jdbc连接（直接写的连接池：读取文件 ，创建连接 ，释放连接）



总结：
区分json对象（和js中的对象类似） 和json格式的字符串（在对象的基础上在收尾加上引号）

fastjson：
转换分为：对象型  数组型  混合型

json字符串转json 
 1.JSONObject jsonObject = JSON.parseObject(JSON_OBJ_STR);//如果是对象是JSONObeject  如果是数组输入JSONArray

 字符串转bean
 Student student = JSON.parseObject(JSON_OBJ_STR, new TypeReference<Student>() {});

bean转json字符串：
String s = JSON.toJSONString(data);//data是个对象



常用就是：json字符串解析，bean转json字符串   ，json字符和json对象的转换





