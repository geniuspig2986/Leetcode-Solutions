total = 50
rotations = 0

with open("D1input.txt", "r") as f:
    for lines in f:
        rotations += int(lines[1:])//100
        remainder = int(lines[1:]) % 100
        if lines[0] == "L":
            if total + remainder >= 100:
                rotations += 1
            total = (total +remainder) % 100
        elif lines[0] == "R":
            if total > 0 and total - remainder <= 0:
                rotations +=1

            total = (total - remainder + 100)%100

print(rotations)
