import numpy as np

class ListComparer:
    def __init__(self, list1, list2):
        self.list1 = list1
        self.list2 = list2

    def calculate_average(self, lst):
        if not lst:
            return 0
        return np.mean(lst)

    def compare_averages(self):
        avg1 = self.calculate_average(self.list1)
        avg2 = self.calculate_average(self.list2)

        if avg1 > avg2:
            return "Первый список имеет большее среднее значение"
        elif avg1 < avg2:
            return "Второй список имеет большее среднее значение"
        else:
            return "Средние значения равны"
