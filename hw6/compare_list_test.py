import pytest
import pylint

from compare_list import ListComparer

# Проверка, когда оба списка пусты.
def test_both_lists_empty():
    lc = ListComparer([], [])
    assert lc.compare_averages() == "Средние значения равны"

# Проверка, когда второй список пуст, а первый список содержит числа.
def test_first_list_empty():
    lc = ListComparer([], [1, 2, 3])
    assert lc.compare_averages() == "Второй список имеет большее среднее значение"


# Проверка, когда второй список пуст, а первый список содержит числа.
def test_second_list_empty():
    lc = ListComparer([1, 2, 3], [])
    assert lc.compare_averages() == "Первый список имеет большее среднее значение"

# Проверка, когда оба списка содержат одинаковые числа.
def test_both_lists_equal_numbers():
    lc = ListComparer([1, 2, 3], [1, 2, 3])
    assert lc.compare_averages() == "Средние значения равны"

# Проверка, когда среднее значение первого списка больше среднего значения второго списка.
def test_first_list_greater_average():
    lc = ListComparer([1, 2, 3, 4], [1, 2, 3])
    assert lc.compare_averages() == "Первый список имеет большее среднее значение"

# Проверка, когда среднее значение второго списка больше среднего значения первого списка.
def test_second_list_greater_average():
    lc = ListComparer([1, 2, 3], [1, 2, 3, 4])
    assert lc.compare_averages() == "Второй список имеет большее среднее значение"


# Тесты охватывают максимально возможные сценарии,
# включая пустые списки, списки с одним числом,
# списки с одинаковыми числами и списки с разными средними значениями.
