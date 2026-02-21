/**
 * 边长为2的正方形，内有一个圆。
 * 则圆的半径为1，则圆的面积为π；
 * 正方形的面积为2*2=4。
 * 圆面积/正方形面积=π/4。
 * 在正方形内点n个点，则落在圆内的点的数量与总的点数的比值为π/4
 * @param numSamples
 * @returns {number}
 */
function estimatePi(numSamples) {
    let insideCircle = 0;

    for (let i = 0; i < numSamples; i++) {
        const x = Math.random();
        const y = Math.random();
        if (x * x + y * y <= 1) {
            insideCircle++;
        }
    }

    const ratio = insideCircle / numSamples;
    return 4 * ratio; // π = 4 * (Area of circle / Area of square)
}

window.onload = function () {
    var val = estimatePi(100000);
    console.log("Estimated π:", val);
    document.getElementById('monteCarloValue').innerHTML = val;
}