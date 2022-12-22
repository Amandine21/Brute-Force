#!/usr/bin/env python
# coding: utf-8

# In[5]:


import math
import matplotlib.pyplot as plt
import numpy as np

capacitor = [.00000000033,0.000000001, 0.000000005, 0.00000001, 0.000000039, 0.0000001, 0.0000047, 0.000001, 0.00001]
resistor = [100.00, 1000.0, 2000.0, 2200.0, 3300.0, 5100.0, 10000.0, 100000.0, 360000.0, 470000.0]

print("\nQ = 1.5 cirtical damped")
for c1 in capacitor:
    for c2 in capacitor:
        for r1 in resistor:
            for r2 in resistor:
                wo = math.sqrt(1/(r1*r2*c1*c2))
                Q = math.sqrt((c1/c2)*(((r1*r2)/(r1+r2))/(r1+r2)))
                if (Q < 1.7 and Q > 1.3 and wo > 2000 and wo < 3000):
                    print("c1: ", c1, "c2: ", "r1: ", r1, "r2: ", r2, "wo: ", wo, "q: ", Q)
    


# In[69]:


#R1 1000
#R2 2000
#C1 1*10^-6 0.000001
#C2 1*10^-7 0.0000001

def A_phase_formula(x): 
        numerator = x*(3000)*0.0000001
        denom = 1-((x**2)*1000*2000*0.000001*0.0000001)
        argument = np.arctan(numerator /denom)
        return -1 * argument

                        
x_range = np.linspace(10, 10000) 
y_range = A_phase_formula(x_range)
plt.figure(num = 0, dpi = 120)
plt.yscale('log')
plt.plot(x_range, y_range)
plt.show()


# In[79]:


#R1 1000
#R2 2000
#C1 1*10^-6 0.000001
#C2 1*10^-7 0.0000001

def B_magnitude_formula(x): 
        numerator = (x**2)*1000*2000*0.000001*0.0000001
        first_denom = (1 - ((x**2)*1000*2000*0.000001*0.0000001))**2
        second_denom = (x**2)**((0.000001*1000)+(0.0000001*1000))**2
        denom = cmath.sqrt(first_denom + second_denom)
        return 1 / denom
    

x_range = np.linspace(10,10000, 10000)     #Making the range of input values to be plugged in a formula
y_range = A_magnitude_formula(x_range)
plt.figure(num=0, dpi=120)
plt.yscale('log')
plt.plot(x_range, y_range)
plt.show()


# In[80]:


#R1 1000
#R2 2000
#C1 1*10^-6 0.000001
#C2 1*10^-7 0.0000001

def A_phase_formula(x): 
        numerator = x*((0.000001*1000)+(0.0000001*1000))
        denom = 1-((x**2)*1000*2000*0.000001*0.0000001)
        argument = np.arctan(numerator /denom)
        return -1 * argument

                        
x_range = np.linspace(10, 10000) 
y_range = A_phase_formula(x_range)
plt.figure(num = 0, dpi = 120)
plt.yscale('log')
plt.plot(x_range, y_range)
plt.show()


# In[ ]:




