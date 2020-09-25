$(function () {
    // 开始写 jQuery 代码...
    console.log("begin.............")

    $("button").click(function(){
        $("p").hide();
    });

    console.log($("#btn1").attr("data-id"))

    console.log( $("span").parent().attr("data-id"))

    $("li").each(function(){
        console.log($(this).text())
    });

    console.log($(".test").attr("id"));
    //循环获取属性值
    $(".test").each(function (index,dom) {
        console.log(index +" :"+$(dom).attr("id"))
    })

    console.log($("#test").attr("data"))
    $("#test").attr({
        "title":'标题',
        "a":"http://www.baidu.com",
        "value":"click me"
    })

    document.getElementById("ele1").style.color="blue";
})