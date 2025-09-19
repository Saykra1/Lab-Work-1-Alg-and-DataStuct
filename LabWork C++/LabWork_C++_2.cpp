#include <iostream>
#include <vector>
#include <cctype>  // Для функций isalpha и isdigit
using namespace std;

int main() {
    // В этом задании не написано использовать срезы,
    // по этому буду проверять какой эл-т число, а какой символ
    vector<char> original = { 'a', '1', 'b', '2', 'c', '3' };// Исходный массив
    vector<char> letters; // Векторный(динамический) массив для букв
    vector<char> numbers; // Векторный(динамический) массив для чисел(цифр)

    for (char c : original) { // Перебо всех эл-тов исходного массива
        if (isalpha(c)) { // Отбираем буквы
            letters.push_back(c); // Добавляем в конец массива
        }
        else if (isdigit(c)) {  // Отбираем цифры
            numbers.push_back(c); // Добавляем в конец массива
        }
    }

    original.clear(); // Отчищаем исходный массив

    for (char c : letters) { 
        cout << c;// Выводим буквы
    }
    cout << endl;

    for (char c : numbers) {
        cout << c;// Выводим цифры
    }
    cout << endl;

    return 0;
}
