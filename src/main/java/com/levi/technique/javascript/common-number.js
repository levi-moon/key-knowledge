/**
 * 数字添加千分符
 * @param num
 * @returns {string}
 */
function formatNumber(num) {
    if (num == null) {
        num = 0;
    }
    if (isNaN(num)) {
        return num = 0;
    }
    return ("" + num).replace(/(\d{1,3})(?=(\d{3})+(?:$|\.))/g, "$1,");
}


/**
 * 转换为亿单位
 * @param option
 * @returns {{unit: string, value: string}|{unit: string, value: string}|string}
 */
function setYiUnit(data) {
    var option = {
        "returnType": data.returnType ? data.returnType : "string", //返回的类型  string 字符串，object 对象
        "n": data.n,   //传入的数字
        "fixed": data.fixed ? data.fixed : 2,  //小数点后多少位
        "needUnit": data.needUnit ? data.needUnit : false  //是否需要返回单位
    };
    var returnType = option.returnType;
    var n = option.n;
    var fixed = option.fixed;
    var needUnit = option.needUnit;
    var num = Number(n);
    if (typeof (num) != "number") {
        console.log("传入数字");
        return;
    }
    var a = 0;
    if (num < 0) {
        a = (num / 100000000 * -1).toFixed(fixed);
        a = "-" + a;
    } else {
        a = (num / 100000000).toFixed(fixed);
    }
    var result;
    if (returnType == "object") {
        if (needUnit) {
            result = {"value": a, "unit": "亿"};
        } else {
            result = {"value": a, "unit": ""};
        }
    } else if (returnType == "string") {
        if (needUnit) {
            result = a + "亿";
        } else {
            result = a + "";
        }
    }
    return result;
}