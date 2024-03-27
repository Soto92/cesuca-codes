# Resumo de Aloritmos de ordenação

## BubbleSort

|         | Melhor caso  | Médio caso  | Pior Caso  |
|---------|--------------|-------------|------------|
|  Tempo  |     O(n)     |    O(n2)    |    O(n2)   |
|  Espaço |     O(1)     |    O(1)     |    O(1)    |

```javascript
function bubbleSort () {
    for (let i = 0; i < bubble.length; i++) {
        if (bubble[i] > bubble[i +1]) {
            let v1 = bubble[i]
            let v2 = bubble[i +1] 
            bubble[i] = v2
            bubble[i +1] = v1
        }
    }
}

console.log(bubbleSort([8,5,1,3,9]))
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