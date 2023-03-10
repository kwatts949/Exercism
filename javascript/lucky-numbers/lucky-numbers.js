// @ts-check

/**
 * Calculates the sum of the two input arrays.
 *
 * @param {number[]} array1
 * @param {number[]} array2
 * @returns {number} sum of the two arrays
 */
export function twoSum(array1, array2) {
  let total = Number(array1.join("")) + Number(array2.join(""));
  return total;
}

/**
 * Checks whether a number is a palindrome.
 *
 * @param {number} value
 * @returns {boolean} whether the number is a palindrome or not
 */
export function luckyNumber(value) {
  let valueAsStr = String(value);
  let valueArr = Number(valueAsStr.split("").reverse().join(""));
  return value === valueArr;
}

/**
 * Determines the error message that should be shown to the user
 * for the given input value.
 *
 * @param {string|null|undefined} input
 * @returns {string} error message
 */
export function errorMessage(input) {
  let inputAsNum = Number(input);

  if (input === null || input === undefined || input === "") {
    return "Required field";
  } else if (isNaN(input) || inputAsNum < 1) {
    return "Must be a number besides 0";
  } else {
    return "";
  }
}
