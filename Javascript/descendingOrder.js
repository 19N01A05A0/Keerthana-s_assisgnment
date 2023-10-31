arr=[2,1,3,0]
function bubbleSort(arr){
    for (let i = 0; i < arr.length - 1; i++){

        let swapped = false

        for (let j = 0; j < arr.length - i - 1; j++){
            
            if (arr[j] > arr[j+1]){
                let temp = arr[j]
                arr[j] = arr[j+1]
                arr[j+1] = temp
                swapped = true
            }
        }

        
        if(!swapped) break;
    }

    return arr
}
console.log("Before sorting: ", arr)
console.log("After sorting: ", bubbleSort(arr))