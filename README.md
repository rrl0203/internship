# internship

In this repo you will find several tools that were used to automate the detection of cryptojacking sites.
This research was performed in two parts:
First the dataset of the Minesweeper project (https://github.com/vusec/minesweeper) was swept again. This provides insight in how the cryptojacking scene altered after the fall of Coinhive.
The second part was a sweep of the Tranco 1M (https://tranco-list.eu/) in order to gain insight in how widespread cryptojacking in general is nowadays.

A summary of the results can be found in cryptojacking.xlsx, along with the used Tranco list in top-1m.csv.
The cryptojacking.xlsx has two tabs, one for each part of this research. 

In addition, in the mining payloads folders, some mining payloads have been gathered, which may be helpful in reverse engineering how cryptojacking works/the patterns that are used.
Also, web-traffic between cryptojacking sites and the host are observed as a proof of websocket connections to mining services for example.
