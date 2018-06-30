### Atma Nirbhar 
              
Our product - “Atma Nirbhar”, which in english means self-reliant, aims of making blind or visually impaired people independent. The idea is to help such people in navigation in crowded places by determining the present location. Other then this it provides feature for currency identification.

## Working or our Product - 

So basically this is how our application works.

Since we want our application to be as easy to use, we launch our app using power button. Once the application opens, bluetooth of the phone automatically switches on. The screen display the urls or the address of the beacons nearby present. Clicking on the volume down button, the app reads out your present location and the direction for your next destination. This data is fetched from the Azure database using the URL of the nearby Beacon. The Volume up button is used to identify the currency note. It opens camera, and after clicking the image, processes the image in the backend using APIs and reads out the value of currency note.

This is how in all, we have made an application so easy for the blind people to use providing essential features.

## Technology stack -

1. Android – Development environment for our product. 

2. Beacons – Beacons are device which is produces URL through the bluetooth data, when we come in its vicinity. We have saved a particular location with each address of the beacon. So when we come near a particular bacon, it sends our present address. We are using Beacons in spite of Geoposition and Wifi, because the radius of beacon is adjustable. So in case of more crowd or other requirement, we can change the area within which the beacon is detected and we can put more check points on any particular station. 

3. Azure.  - Since we need to save the address with each URL of Beacon, we needed a database. Also like for example if I enter lets say Delhi railway station. It will fetch the data of each station and determine which station I am presently on. Next if I am detected to be on platform 1, it will then fetch the data of different checkpoints present on platform number. 

4. Microsoft cognitive speech APIs. -      We have made use of Microsoft bing speech APIs. To take input from the user through voice and reading out the location.     

5. Google cloud vision API -               
 We have used the web entities of Google Cloud vision for determining the value of currency notes. Other methods for this purpose was not much accurate. And colour differentiation could be an option like discussed yesterday, but will not be scalable for the different countries of the world. 


## Why we picked this idea  -

Coming from technical background, we always aim to create application that will serve for a step towards betterment, that is what our theme - “ Hack for Good”. 
So, we came to know that after demonitization, the difference in the size of new notes of 50 and 200 is just 4mm, while previously there was a difference of 10mm. Even the international standard is set to be 5mm. So blind people are facing so much problem for identifying notes by themselves. There is even petition signed by many NGOs for the against RBI. There is small sign provided on the notes but it damage with time, as thousands of people use the same. So we have developed such application which helps blind people to travel independently. The next huge dellime for them is to navigate. Specially in the sensitive places like metros and railways where there is huge crowd and they easily get deviated towards wrong path. Also in the big places like New Delhi airport we need a personal guide for navigation. And also some thing to tell whether we are going in the right direction or we have reached wrong destination. We ourself need help when we first visited there, and in spite of being able to see, I needed help of people nearby to ask where the particular place was. 

## Audience target -
Anyone who faces difficulty in finding location in sensitive areas or people with visual impairment who want to travel and work independently.

## Unique selling point -

The unique selling point of our product is that
1. Easy to Use.
2. Its Use Case is huge and easily expandable. 
3. Most accurate method for currency identification. 


Author : Pragya and Nisha Agarwal



