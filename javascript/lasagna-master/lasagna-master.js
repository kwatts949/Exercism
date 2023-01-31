/// <reference path="./global.d.ts" />
// @ts-check

export function cookingStatus(timer) {
  if (timer > 0) {
    return "Not done, please wait.";
  } else if (timer === 0) {
    return "Lasagna is done.";
  } else {
    return "You forgot to set the timer.";
  }
}

export function preparationTime(layers, time = 2) {
  return layers.length * time
}


export function quantities(layers) {
  let noodleAmount = (layers.filter(x => x === 'noodles').length) * 50
  let sauceAmount = (layers.filter(x => x === 'sauce').length) * 0.2
  // console.log(noodleAmount, sauceAmount)
  let ingredients = {noodles: noodleAmount, sauce: sauceAmount}
  return ingredients
}