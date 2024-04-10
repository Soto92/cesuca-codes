// Função para ajustar um nó em um heap
function heapify(arr, n, i) {
  let largest = i; // Inicializa o maior como raiz
  const left = 2 * i + 1; // índice do filho esquerdo
  const right = 2 * i + 2; // índice do filho direito

  // Se o filho esquerdo é maior que a raiz
  if (left < n && arr[left] > arr[largest]) {
    largest = left;
  }

  // Se o filho direito é maior que o maior até agora
  if (right < n && arr[right] > arr[largest]) {
    largest = right;
  }

  // Se o maior não é a raiz
  if (largest !== i) {
    // Troca a raiz com o maior
    [arr[i], arr[largest]] = [arr[largest], arr[i]];
    // Recursivamente ajusta o heap afetado
    heapify(arr, n, largest);
  }
}

// Função principal que realiza o Heapsort
function heapSort(arr) {
  const n = arr.length;
  // Constrói um heap (rearranja o array)
  for (let i = Math.floor(n / 2) - 1; i >= 0; i--) {
    heapify(arr, n, i);

  }
  // Extrai elementos um por um do heap
  for (let i = n - 1; i > 0; i--) {
    // Move a raiz atual para o final
    [arr[0], arr[i]] = [arr[i], arr[0]];
    // Chama a função heapify no heap reduzido
    heapify(arr, i, 0);
  }
  return arr;
}
// Exemplo de uso
const array = ["Mauricio", "Maria", "Jo"];
console.log("Array original:", array);
heapSort(array);
console.log("Array ordenado:", array);