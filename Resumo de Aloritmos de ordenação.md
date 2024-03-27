# Resumo de Aloritmos de ordenação

## BubbleSort

|         | Melhor caso  | Médio caso  | Pior Caso  |
|---------|--------------|-------------|------------|
|  Tempo  |     O(n)     |    O(n2)    |    O(n2)   |
|  Espaço |     O(1)     |    O(1)     |    O(1)    |

```javascript
function bubbleSort(array) {
    const len = array.length;

    for (let i = 0; i < len - 1; i++) {
        for (let j = 0; j < len - i - 1; j++) {
            if (array[j] > array[j + 1]) {
                const temp = array[j];
                array[j] = array[j + 1];
                array[j + 1] = temp;
            }
        }
    }
    return array;
}
```

## InsertionSort

|         | Melhor caso  | Médio caso  | Pior Caso  |
|---------|--------------|-------------|------------|
|  Tempo  |      O(n)    |     O(n2)   |    O(n2)   |
|  Espaço |      O(1)    |     O(1)    |    O(1)    |

```javascript
function insertionSort = (arr) => {
  for (let i = 1; i < arr.length; i++) {
    let currentValue = arr[i];
    let j = i - 1;
    while (j >= 0 && arr[j] > currentValue) {
      arr[j + 1] = arr[j];
      j--;
    }
    arr[j + 1] = currentValue;
  }
  return arr;
}
```

### Referencias

- [Visualgo](https://visualgo.net/en/sorting?slide=1-1)