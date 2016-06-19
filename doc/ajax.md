##ajax develop
代码位于springboot-test/src/main/webapp/ajax/
浏览器访问：http://localhost:8080/userList，
结果：
```
[
    {
        "username": "Ryan",
        "password": "123456",
        "age": 18,
        "birth": "1991-02-23",
        "sex": "man"
    },
    {
        "username": "Leslie",
        "password": "password",
        "age": 18,
        "birth": "1993-02-23",
        "sex": "woman"
    },
    {
        "username": "XiaoMing",
        "password": "bugaosuni",
        "age": 8,
        "birth": "1891-12-03",
        "sex": "man"
    },
    {
        "username": "Tom",
        "password": "chiru",
        "age": 28,
        "birth": "1981-02-23",
        "sex": "man"
    }
]
```

而是用ajax就可以直接得到这个数据：
```
$.ajax({
                url: "/user/userList",
                type: "get",
                dataType: "json",
                success: function (data) {
                    //data数据
                    console.log(data)
                    for(var element in data){
                        //将json Array的每一项取出来
                        user = data[element];
                        console.log(user);
                        console.log(user.username+'-'+user.age+"-"+user.sex);
                        var template = "<tr> " +
                                "<td>" +user.username+ "</td>" +
                                "<td>" +user.password+ "</td> " +
                                "<td>" +user.age+ "</td> " +
                                "<td>" +user.sex+ "</td>" +
                                "<td>修改/删除</td>" +
                                "</tr>";
                        $("#user_list").append(template);
                    }

                }
            });
```