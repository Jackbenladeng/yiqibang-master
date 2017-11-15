<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html >

<html lang="en">
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>Title</title>
    <link rel="stylesheet" href="后台管理界面css.css">
    <link rel="stylesheet" href="bootstrap/css/bootstrap.min.css">
	<script type="text/javascript" src="jquery/jquery-1.11.1.min.js"></script>
	<style type="text/css">
	/*样式初始化*/
@charset "UTF-8";

*{
    margin: 0;
    padding:0;
}
body{
    font-family: 微软雅黑;
    background: #e4e4e4;
}

ul,ol,li{
    list-style: none;
}
a{
    text-decoration: none;
}
/*通用样式*/
.clear{
    overflow: hidden;
    zoom: 0;
}
/*头部样式*/
.header{
    width:80%;
    height: 40px;
    background: #1c314a;
    margin: 0 auto;
    line-height: 40px;
}
.header .left>*{
    font-size: 12px;
    color: white;
    float: left;

}
.left>img{
    width: 40px;
    height: 30px;
    margin-top: 5px;
    margin-left:10px ;
}
.left>p{
    margin-left:5px ;
}

.header .right{
    float: right;
    margin-right: 50px;

}
.right>span{
    font-size: 14px;
    color: white;
    margin-left: 15px;
}
/*内容部分*/
.content{
    width: 80%;
    height: 530px;
    background: #1b2531;
    margin: 0 auto;
    position: relative;
}
.content .left1{
    width:20%;
    height: 530px;
    background: red;
}
.left1 ul li{
    font-size: 14px;
    color: white;
    padding-top: 10px;
    line-height: 30px;
    width: 100%;
    padding-left:10px ;
}

.left1 span{
    margin-left: 10px;

}
.left1 .yiqibang{

    margin-left: 50px;
    margin-top: 260px;
}


.right1>div{
    width:80%;
    height: 530px;
    background:whitesmoke;
    position: absolute;
    left: 20%;
    top: 0;

}
.right1 .up{
    width: 100%;
    height: 40px;
    background: green;
    position: relative;

}
.up .form-inline{
    position:absolute ;
    height: 30px;
    width: 20%;
    left: 40%;
    top:3px;
}
.up button{
    width: 6%;
    height: 20px;
    position: absolute;
    top: 10px;
    right: 50px;
}
.up span{
    height:40px;
    line-height:40px;
    font-size: 14px;
    color: blue;
    margin-left: 50px;

}


.down>div{
    width:100%;
    height: 490px;
    position: absolute;
    left: 0%;
    top: 40px;
    /*display: none;*/
}



.right1 .down table{
        /*border: 1px solid black;*/
        border-collapse: collapse;
        width: 100%;

    }
 .down table tr td,table th{
        border: 1px solid black;
        text-align: center;
}
 .down table tr td button:last-child{
        margin-left: 20px;
}
.editTr{
    display: none;
}

	
	
	
	</style>
    <script>
        $(function () {
            /*左边的li条目的鼠标移入事件*/
            $("#cat_li>li").mouseover(function () {
                /*先将左边所有的条目的背景都变为未选状态*/
                $("#cat_li>li").css("background", "red");
                /*将移入事件触发的那个条目背景变为选中状态*/
                $(this).css("background", "black");

                /*将右边所有的div都隐藏，再将当前选中的条目所对应的索引的div放出来*/
                $(".right1>div").css("display", "none");
                $(".right1>div").eq($(this).index()).css("display", "block");
            });
            /*右边内容区鼠标移入事件*/
            $(" .right1>div").mouseover(function () {
                $(this).css("display", "block");
                $("#cat_li>li").eq($(this).index()).css("background", "#f94b16");
            });
            /*整个大的分类盒子的鼠标移出事件*/
            $("#page>.content").mouseout(function () {
                $("#cat_li>li").css("background", "red");
                $(".right1>div").css("display", "none");
            });


            $(".up>span").mouseover(function () {
                $(".up>span").css("background", "white");
                /*将移入事件触发的那个条目背景变为选中状态*/
                $(this).css("background", "orange");


                $(".down>div").css("display", "none");
                $(".down>div").eq($(this).index()).css("display", "block");
            });
            /*右边内容区鼠标移入事件*/
            $(".down>div").mouseover(function () {
                $(this).css("display", "block");
                $(".up>span").eq($(this).index()).css("background", "#f94b16");
            });

        })


        var aData = [
            {
                name: "盲僧",
                nickname: "瞎子",
                sex: true,
                birthday: 2009 - 08 - 08,
                address: "召唤师峡谷",
                num: 15113323513,
                state: "可用",
                ctime: 2011 - 09 - 17,
                gtime: 2017 - 10 - 24,
                logtime: "无操作",
                img: "头像",
                remarks: "一库",
            },
            {
                name: "瑞兹",
                nickname: "光头",
                sex: true,
                birthday: 2009 - 09 - 08,
                address: "召唤师峡谷",
                num: 15113323512,
                state: "可用",
                ctime: 2011 - 05 - 17,
                gtime: 2017 - 07 - 24,
                logtime: "无操作",
                img: "头像",
                remarks: "快走快走",
            }
        ];
        /*模拟从服务器获取到的数据---就是对象数组*/
        window.onload = function () {
            showPerList();

//            var addBtn = document.getElementById("add_btn");
//            var usernameIpt=document.getElementById("username");
//            var ageIpt=document.getElementById("age");
//            var manIpt=document.getElementById("man");
//            var numIpt=document.getElementById("num");
//
//            addBtn.onclick=function () {
//                /*获取用户输入的字段值，并拼接为对象，将对象添加到数组，将数组重新显示*/
//                var username=usernameIpt.value;
//                var age=ageIpt.value;
//                var sex=true;
//                if(!manIpt.checked){/*获取manIpt的checked属性，为true表示选中*/
//                    sex=false;
//                }
//                var num=numIpt.value;
//
//                if(username!=""&&age!=""&&num!=""){
//                    var person={
//                        name:username,
//                        usernum:usernum,
//                        username:name,
//                        sex:sex,
//                        num:num
//                    }
//                    aData.push(person);
//                    showPerList();
//                }else{
//                    alert("请将信息输入完整");
//                }
//            }
        }

        function showPerList() {
            var perList = document.getElementById("perListBox");
            var innerT = "";
            for (var i = 0; i < aData.length; i++) {/*对对象数组进行遍历，每有一个对象就拼接一个tr*/
                innerT += '<tr id="showTr' + i + '">'
                        + '<td>' + (i + 1) + '</td>'
                        + '<td>' + aData[i].name + '</td>'
                        + '<td>' + aData[i].nickname + '</td>'
                        + '<td>' + (aData[i].sex ? "男" : "女") + '</td>'
                        + '<td>' + aData[i].birthday + '</td>'
                        + '<td>' + aData[i].address + '</td>'
                        + '<td>' + aData[i].num + '</td>'
                        + '<td>' + aData[i].state + '</td>'
                        + '<td>' + aData[i].ctime + '</td>'
                        + '<td>' + aData[i].gtime + '</td>'
                        + '<td>' + aData[i].logtime + '</td>'
                        + '<td>' + aData[i].img + '</td>'
                        + '<td>' + aData[i].remarks + '</td>'

                        + '<td>'
                        + '<button onclick="editPerson(' + i + ')">设置</button>'
                        + '</td>'

                        + '<td>'
                        + '<button onclick="editPerson(' + i + ')">编辑</button>'
                        + '<button onclick="delPeron(' + i + ')">删除</button>'
                        + '</td>'


                        + '</tr>'
                        + '<tr class="editTr">'
                        + '<td>' + (i + 1) + '</td>'
                        + '<td><input type="text" value="' + aData[i].name + '" id="name' + i + '"></td>'
                        + '<td><input type="text" value="' + aData[i].nickname + '" id="nickname' + i + '"></td>'
                        + '<td>'
                        + '<input type="radio" name="sex' + i + '" ' + (aData[i].sex ? "checked" : "") + ' id="man' + i + '">男'
                        + '<input type="radio" name="sex' + i + '" ' + (aData[i].sex ? "" : "checked") + '>女'
                        + '</td>'
                        + '<td><input type="text" value="' + aData[i].birthday + '" id="birthday' + i + '"></td>'
                        + '<td><input type="text" value="' + aData[i].address + '" id="address' + i + '"></td>'
                        + '<td><input type="text" value="' + aData[i].num + '" id="num' + i + '"></td>'
                        + '<td><input type="text" value="' + aData[i].state + '" id="state' + i + '"></td>'
                        + '<td><input type="text" value="' + aData[i].logtime + '" id="logtime' + i + '"></td>'
                        + '<td><input type="text" value="' + aData[i].img + '" id="img' + i + '"></td>'
                        + '<td><input type="text" value="' + aData[i].remarks + '" id="remarks' + i + '"></td>'
                        + '<td>'
                        + '<button onclick="sureEdit(' + i + ')">确定</button>'
                        + '<button onclick="cancel(' + i + ')">取消</button>'
                        + '</td>'
                        + '</tr>';
            }
            perList.innerHTML = innerT;
        }

        function sureEdit(index) {
            /*点击确定，获取编辑框的输入值，组成对象，然后将数组中对应索引下的元素对象替换，重新显示数组*/
            var name = document.getElementById("name" + index).value;
            var nickname = document.getElementById("nickname" + index).value;
            var sex = true;
            if (!document.getElementById("man" + index).checked) {
                sex = false;
            }
            var birthday = document.getElementById("birthday" + index).value;
            var address = document.getElementById("address" + index).value;
            var num = document.getElementById("num" + index).value;
            var state = document.getElementById("state" + index).value;
            var ctime = document.getElementById("ctime" + index).value;
            var gtime = document.getElementById("gtime" + index).value;
            var logtime = document.getElementById("logtime" + index).value;
            var img = document.getElementById("img" + index).value;

            var remarks = document.getElementById("remarks" + index).value;
            var person = {
                name: name,
                nickname: nickname,
                sex: sex,
                birthday: birthday,
                address: address,
                num: num,
                state: state,
                ctime: ctime,
                gtime: gtime,
                logtime: logtime,
                img: img,
                remarks: remarks,
            }
            aData[index] = person;
            showPerList();
        }

        function cancel(index) {
            var editTr = document.getElementsByClassName("editTr")[index];
            editTr.style.display = "none";
            document.getElementById("showTr" + index).style.display = "table-row";
        }
        function editPerson(index) {
            var editTr = document.getElementsByClassName("editTr")[index];
            editTr.style.display = "table-row";
            document.getElementById("showTr" + index).style.display = "none";
        }

        function delPeron(index) {
            /*从数组中删除下标为index的对象元素，从新显示数组*/
            aData.splice(index, 1);
            showPerList();
        }
    </script>

</head>
<body>
<div id="page">
    <div class="header">
        <div class="left">
            <img src="img/touxiang.png">
            <p>刘老师</p>
        </div>
        <div class="right">
            <span>注销</span>
        </div>
        <div class="clear"></div>
    </div>
    <div class="content">
        <div class="left1">
            <ul id="cat_li">
                <li><img src="img/yonghuguanli.png">
                    <span>用户管理</span>
                </li>
                <li><img src="img/xinwenguanli.png">
                    <span>新闻管理</span>
                </li>
                <li><img src="img/pinglungunali.png">
                    <span>评论管理</span>
                </li>
                <li><img src="img/xinwenpachong.png">
                    <span>新闻爬虫</span>
                </li>
                <li><img src="img/xinwenfenleiguanli.png">
                    <span>新闻分类管理</span>
                </li>
            </ul>
            <img class="yiqibang" src="img/logo1.png">

        </div>
        <div class="right1">
            <div class="one">
                <div class="up">
                        <span>会员</span>
                        <span>管理员</span>
                    <!--<input type="text" placeholder="昵称/用户名/手机/备注">-->
                    <form class="form-inline">
                        <div class="form-group has-success has-feedback">
                            <input type="text" class="form-control" id="inputSuccess4"
                                   aria-describedby="inputSuccess4Status" placeholder="昵称/用户名/手机/备注">
                            <span class="glyphicon glyphicon-search form-control-feedback" aria-hidden="true"></span>
                        </div>
                    </form>
                    <button>添加</button>
                </div>
                <div class="down">
                    <div class="down1">
                        <table cellpadding="6px" class="table">
                            <thead>
                            <th>序号</th>
                            <th>用户名</th>
                            <th>昵称</th>
                            <th>性别</th>
                            <th>生日</th>
                            <th>地址</th>
                            <th>手机号</th>
                            <th>状态</th>
                            <th>创建时间</th>
                            <th>修改时间</th>
                            <th>登录时间</th>
                            <th>头像</th>
                            <th>备注</th>
                            <th>设为管理员</th>
                            <th>操作</th>
                            </thead>
                            <tbody id="perListBox">

                            </tbody>
                        </table>
                    </div>
                    <div class="down2">
                        <table cellpadding="6px" class="table">
                            <thead>
                            <th>序号</th>
                            <th>级别</th>
                            <th>状态</th>
                            <th>用户名</th>
                            <th>添加时间</th>
                            <th>操作</th>
                            </thead>
                            <tbody id="perListBox1">

                            </tbody>
                        </table>
                    </div>
                    </div>
                </div>
                <div class="two">
                    <div class="up">
                        <form class="form-inline">
                            <div class="form-group has-success has-feedback">
                                <input type="text" class="form-control" id="inputSuccess5"
                                       aria-describedby="inputSuccess4Status" placeholder="输入搜索内容">
                                <span class="glyphicon glyphicon-search form-control-feedback" aria-hidden="true"></span>
                            </div>
                        </form>
                        <button>添加</button>
                    </div>
                    <div class="down22">
                        <table cellpadding="6px" class="table">
                            <thead>
                            <th>序号</th>
                            <th>标题</th>
                            <th>来源</th>
                            <th>分类</th>
                            <th>浏览数量</th>
                            <th>评论数量</th>
                            <th>图片1</th>
                            <th>图片2</th>
                            <th>图片3</th>
                            <th>视频</th>
                            <th>创建时间</th>
                            <th>修改时间</th>
                            <th>内容</th>
                            <th>操作</th>
                            </thead>
                            <tbody id="perListBox2">

                            </tbody>
                        </table>
                    </div>

                </div>
                <div class="three">
                    <div class="up">
                        <form class="form-inline">
                            <div class="form-group has-success has-feedback">
                                <input type="text" class="form-control" id="inputSuccess6"
                                       aria-describedby="inputSuccess4Status" placeholder="输入搜索内容">
                                <span class="glyphicon glyphicon-search form-control-feedback" aria-hidden="true"></span>
                            </div>
                        </form>
                        <button>添加</button>
                    </div>
                    <div class="down3">
                        <table cellpadding="6px" class="table">
                            <thead>
                            <th>序号</th>
                            <th>评论时间</th>
                            <th>评论用户</th>
                            <th>类型</th>
                            <th>评分</th>
                            <th>评论内容</th>
                            <th>状态</th>
                            <th>是否删除</th>
                            <th>评论时间</th>
                            <th>操作</th>
                            </thead>
                            <tbody id="perListBox3">

                            </tbody>
                        </table>
                    </div>
                </div>
                <div>4</div>
                <div class="five">
                    <div class="up">
                        <form class="form-inline">
                            <div class="form-group has-success has-feedback">
                                <input type="text" class="form-control" id="inputSuccess7"
                                       aria-describedby="inputSuccess4Status" placeholder="输入搜索内容">
                                <span class="glyphicon glyphicon-search form-control-feedback" aria-hidden="true"></span>
                            </div>
                        </form>
                        <button>添加</button>
                    </div>
                    <div class="down5">
                        <table cellpadding="6px" class="table">
                            <thead>
                            <th>序号</th>
                            <th>名称</th>
                            <th>创建时间</th>
                            <th>操作</th>
                            </thead>
                            <tbody id="perListBox4">

                            </tbody>
                        </table>
                    </div>
                </div>

            </div>
        </div>
    </div>
</body>
</html>