// Função para trocar dois elementos em um array
function swap(arr, i, j) {
    const temp = arr[i];
    arr[i] = arr[j];
    arr[j] = temp;
}

// Função para escolher o pivô e particionar o array
function partition(arr, low, high) {
    const pivot = arr[high]; // Pivô é o último elemento
    let i = low - 1; // Índice do menor elemento
    for (let j = low; j < high; j++) {
        // Se o elemento atual é menor ou igual ao pivô
        if (arr[j] <= pivot) {
            i++; // Incrementa o índice do menor elemento
            swap(arr, i, j); // Troca arr[i] e arr[j]
        }
    }
    swap(arr, i + 1, high); // Troca arr[i + 1] e arr[high] (ou seja, o pivô)
    return i + 1; // Retorna o índice do pivô
}

// Função principal que implementa o algoritmo Quick Sort
function quickSort(arr, low = 0, high = arr.length - 1) {
    if (low < high) {
        // Encontra o índice do pivô
        const pivotIndex = partition(arr, low, high);
        // Ordena os elementos antes e depois do pivô
        quickSort(arr, low, pivotIndex - 1);
        quickSort(arr, pivotIndex + 1, high);
    }
    return arr;
}

// Exemplo de uso
const string = 'jihfecba';
console.log("Array original:", string.split(""));

const arrayOrdenado = quickSort(string.split(""))
console.log("Array ordenado:", arrayOrdenado.join());
