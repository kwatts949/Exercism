export function decodedValue(resistorColours: string[]) {
  console.log(resistorColours)

  const valueOne = resistorColours[0]
  const valueTwo = resistorColours[1]

  console.log(valueOne)

  const colours = {
    black: 0,
    brown: 1,
    red: 2,
    orange: 3,
    yellow: 4,
    green: 5,
    blue: 6,
    violet: 7,
    grey: 8,
    white: 9,
  };
  console.log((colours));
}
