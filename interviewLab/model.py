import numpy as np 
import matplotlib.pyplot as plt 
import pandas as pd 
from sklearn.linear_model import LogisticRegression

#getData()
data = pd.read_csv('credit_data.csv') 

#feature engineering for y// predicted variable
replacements = {
    'good':1,
    'bad':2
}
data['class'].replace(replacements, inplace=True)

#Trimming dataset, after running in Weka we see only a 5% loss in accuracy compared to 33 variables
#easier to maintain
new_data = data[['housing','current_balance','location','cc_age','existing_credits','num_dependents','class']]

#feature engineering the predictor variables
replacements_x = {
    'own':1,
    'for free':2,
    'rent':3
}
new_data['housing'].replace(replacements_x, inplace=True)

#define predictor and predicted
x = new_data.iloc[:, range(0,6)].values  

y = new_data.iloc[:, 6].values   


#get tools/ model
bnb = LogisticRegression()
y=y.astype('int')

#train model
#should be noted this is somewhat oversimplified and methods exist to achieve higher accuracy
bnb.fit(x,y)

#see accuracy
bnb.score(x,y)

user_x = list(list())
user_x = [int(i) for i in input("\nPlease input answers as array seprated with spaces.\nThere Should be 6 numbers total.\n Whether you own your own home (1), dont pay rent (2), or own a home(3)\nWhat your current credit balance is.\nLocation number(1-4)\nCredit card age.\nNumber of open lines of credit.\nNumber of dependents.\n").split()]
user_xprime=[user_x]

#run test on current data
y_new = bnb.predict(user_xprime)

#see data
for e in y_new:
	print(e)

