# Error Analysis Report

## Intro to Computer Programming

## Alexandra Matos & Matthew Williams

Each time the model is run, we get a different percent error because we are shuffling the results we choose in the array. When the model runs many times, the model’s performance is in the high 90th percentile. By taking into account the mean and standard deviation of each run, we can presume that the performance on unseen data can be expected to vary 95% ± 3%. Realistically, a sensible baseline for our model is 4%, as that is the average error for doctors misdiagnosing invasive carcinoma. 
 
In terms of medicine, diagnoses carry a very large importance. A medical false positive would be an instance in which a patient is diagnosed with an illness when in reality, said illness does not exist within them. A false negative is a diagnosis in which the results show a negative when the patient is in fact ill. 
 
The difference between recall and precision is based on the relevancy of the results. Precision is based on how many of the selected pieces of data are relevant while recall is based on how many relevant pieces of selected data are relevant. In terms of medicine, recall asks “of the people who are sick how many did I catch” while precision asks “of the people I assumed are sick, how many actually are?”  To maximize recall, we would have to assume everyone is sick. However, this would impact precision, bringing it down to 35%. 
 
When changing the hyperparameter K, results will inevitable vary too. Depending on the size of K, results can become more accurate or less accurate. This is dependent on the amount and type of data points surrounding the one in question. Furthermore, a K that is even could cause issues as the result could end up being a tie. 
 

