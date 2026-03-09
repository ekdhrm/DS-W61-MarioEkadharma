Question number two
Identify which class method is called What is the output of the program? Why are the two lines different?

Answer:
1. Output "Vehicle is moving" itu dari method v1.move() yang berasal dari Vehicle Class
2. Output "Car is moving" itu dari method v2.move() yang berasal dari Car Class

Explain:
Terjadi dua output berbeda karena scope reference dari masing-masing, variable v1 mengambil attribute dan method dari class Vehicle sedangkan variable v2 mengambil attribute dan method dari class Car yang mana method move milik class Car itu sudah ditimpa sehingga proses yang dikerjakan itu berbeda dari class Vehicle.