/// <reference path="./global.d.ts" />
// @ts-check

export function cookingStatus(timer) {
  if (timer > 0) {
    return 'Not done, please wait.'
  } else if (timer === 0) {
    return 'Lasagna is done.'
  } else {
    return 'You forgot to set the timer.'
  }
}
