total = 0
with open("D3input.txt", "r") as f:
    for line in f:
        maxdigit1 = 0
        maxdigit2 = 0
        maxindex = 0
        for i in range(len(line)-1):
            if maxdigit1 < int(line[i]):
                maxdigit1 = int(line[i])
                maxindex = i
        if maxindex == len(line)-2:
            for i in range(0, maxindex):
                if maxdigit2 < int(line[i]):
                    maxdigit2 = int(line[i])
            total += maxdigit1 + maxdigit2*10
        else:
            for i in range(maxindex + 1, len(line)-1):
                if maxdigit2 < int(line[i]):
                    maxdigit2 = int(line[i])
            total += maxdigit1*10 + maxdigit2
print(total)
