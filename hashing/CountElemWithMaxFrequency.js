// https://leetcode.com/problems/count-elements-with-maximum-frequency/
// !pending
function totalFrequency(input) {
  let map = {};
  for (let i = 0; i < input.length; i++) {
    if (map.hasOwnProperty(input[i])) {
      map[input[i]]++;
    } else {
      map[input[i]] = 1;
    }
  }
  console.log("map: ", map);
}

totalFrequency([1, 2, 2, 3, 1, 4]);
