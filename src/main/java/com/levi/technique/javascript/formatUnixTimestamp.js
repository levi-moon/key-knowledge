function formatUnixTimestamp(unixTimestamp) {
    // 创建一个新的Date对象
    const date = new Date(unixTimestamp * 1000); // 因为JavaScript中的Date构造函数接收的是毫秒，所以需要乘以1000

    // 获取年、月、日、小时、分钟、秒
    const year = date.getFullYear();
    const month = String(date.getMonth() + 1).padStart(2, '0'); // 月份是从0开始的，所以要加1，并确保是两位数
    const day = String(date.getDate()).padStart(2, '0');
    const hours = String(date.getHours()).padStart(2, '0');
    const minutes = String(date.getMinutes()).padStart(2, '0');
    const seconds = String(date.getSeconds()).padStart(2, '0');

    // 格式化输出
    return `${year}-${month}-${day} ${hours}:${minutes}:${seconds}`;
}

function formatTime(){
    var unixTimestamp = document.getElementById('unixTimestamp').value;
    console.log(unixTimestamp)
    var val = formatUnixTimestamp(unixTimestamp)
    document.getElementById('formatUnixTimestamp').innerHTML = val;
}

window.onload = function () {
    formatTime();
}