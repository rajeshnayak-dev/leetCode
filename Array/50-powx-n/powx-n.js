/**
 * @param {number} x
 * @param {number} n
 * @return {number}
 */
var myPow = function(x, n) {
    if (n === 0) return 1;

    let exp = Math.abs(n);
    let result = 1;

    while (exp > 0) {
        if (exp % 2 === 1) {
            result *= x;
        }

        x *= x;
        exp = Math.floor(exp / 2);
    }

    return n < 0 ? 1 / result : result;
};