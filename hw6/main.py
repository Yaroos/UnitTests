from compare_list import ListComparer

if __name__ == '__main__':
    list_1 = [1, 2]
    list_2 = []

    result = ListComparer(list_1, list_2).compare_averages()
    print(result)
