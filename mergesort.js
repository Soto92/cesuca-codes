function merge(left, right) {
  let resultArray = [],
    leftIndex = 0,
    rightIndex = 0;

 // Concatenar valores enquanto ainda houver elementos nos arrays left e right
  while (leftIndex < left.length && rightIndex < right.length) {
    if (left[leftIndex] < right[rightIndex]) {
      resultArray.push(left[leftIndex]);
      leftIndex++;
    } else {
      resultArray.push(right[rightIndex]);
      rightIndex++;
    }
  }

  // Concatenar os elementos restantes de left (se houver)
  while (leftIndex < left.length) {
    resultArray.push(left[leftIndex]);
    leftIndex++;
  }

  // Concatenar os elementos restantes de right (se houver)
  while (rightIndex < right.length) {
    resultArray.push(right[rightIndex]);
    rightIndex++;
  }
  return resultArray;

}

function mergeSort(arr) {
  if (arr.length <= 1) {
    return arr;
  }
  const middle = Math.floor(arr.length / 2);
  const left = arr.slice(0, middle);
  const right = arr.slice(middle);
  return merge(mergeSort(left), mergeSort(right));

}

// Exemplo de uso:
const array = [3, 4, 9, 2, 5, 8, 2, 1, 7, 4, 6, 2, 9, 8, 5, 1];
console.log("Array original:", array);
console.log("Array ordenado:", mergeSort(array));