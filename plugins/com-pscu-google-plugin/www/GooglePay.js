var exec = require('cordova/exec');

exports.callFunctionOne = function(success, error) {
    console.log('inside callFunctionOne');
    exec(success, error, 'GooglePay', 'callFunctionOne', ['Hello Param!']);
};

// exports.callFunctionOne = function(success, error) {
//     console.log('inside callFunctionOne');
//     exec(success, error, 'GooglePay', 'functionOne');
// };

// exports.callFunctionTwo = function(success, error) {
//     console.log('inside callFunctionTwo');
//     exec(success, error, 'GooglePay', 'functionTwo');
// };
