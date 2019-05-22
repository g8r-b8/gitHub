#update
import pandas as pd
from matplotlib import pyplot as plt
v1 = [ 1,2,3,4,5,6]
v2 = [1,4,9,3,32,3]
v3 = [1,2,4,6,4,3]

plt.plot(v1,v2)
plt.plot(v1,v3)

plt.title("Hello MatPlotLib!")
plt.xlabel("v1")
plt.ylabel("v2 and v3")

plt.legend(["this is v2","this is v3"])

plt.show()

#print("Howdy World")

