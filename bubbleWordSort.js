const bubbleSortWords = (words) => {
  for (let i = 0; i < words.length; i++) {
    for (let j = 0; j < words.length - i - 1; j++) {
      if (words[j] > words[j + 1]) {
        let temp = words[j];
        words[j] = words[j + 1];
        words[j + 1] = temp;
      }
    }
  }
  return words;
};

const input = ["banana", "bananaz", "abacaxi", "uva", "laranja", "manga"];
const output = bubbleSortWords(input);
console.log(output);