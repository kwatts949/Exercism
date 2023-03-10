// @ts-check
//
// The line above enables type checking for this file. Various IDEs interpret
// the @ts-check directive. It will give you helpful autocompletion when
// implementing this exercise.

import { Console } from "console";

/**
 * Determines how long it takes to prepare a certain juice.
 *
 * @param {string} name
 * @returns {number} time in minutes
 */
export function timeToMixJuice(name) {
  switch (name) {
    case "Pure Strawberry Joy":
      return 0.5;
    case "Energizer":
      return 1.5;
    case "Green Garden":
      return 1.5;
    case "Tropical Island":
      return 3;
    case "All or Nothing":
      return 5;
    default:
      return 2.5;
  }
}

/**
 * Calculates the number of limes that need to be cut
 * to reach a certain supply.
 *
 * @param {number} wedgesNeeded
 * @param {string[]} limes
 * @returns {number} number of limes cut
 */
export function limesToCut(wedgesNeeded, limes) {
  let totalWedges = 0;
  let i = 0;

  while (i < limes.length && totalWedges <= wedgesNeeded) {
    switch (limes[i]) {
      case "small":
        totalWedges += 6;
        break;
      case "medium":
        totalWedges += 8;
        break;
      case "large":
        totalWedges += 10;
        break;
    }
    if (wedgesNeeded !== 0) {
      i++;
    }
  }
  return i;
}

/**
 * Determines which juices still need to be prepared after the end of the shift.
 *
 * @param {number} timeLeft
 * @param {string[]} orders
 * @returns {string[]} remaining orders after the time is up
 */
export function remainingOrders(timeLeft, orders) {
  let prepTime = 0;
  let i = 0;

  while (prepTime <= timeLeft) {
    i++;
    if (prepTime <= timeLeft) {
      prepTime += timeToMixJuice(orders[i]);
      orders.splice(0, 1);
    }
  }
  return orders;
}
