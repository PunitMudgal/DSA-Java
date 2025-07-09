function firstRecurringCharacter(input) {
  let map = {};
  for (let i = 0; i < input.length; i++) {
    if (map[input[i]] !== undefined) {
      return input[i];
    } else {
      map[input[i]] = i;
    }
    console.log(map);
  }
  console.log("map: ", map);
  return undefined;
}
firstRecurringCharacter([2, 3, 4, 5, 2, 2, 54, 2]);
