# Bowling Game Kata - Java

## Prepare to download the internet.

I have been preparing katas in a number of languages/platforms
and have been able to run the entire kata without any dependency.

For the Java kata, I was using IntelliJ, which has a built-in
awesomeness that allows you to right-click on a file and say "run the tests".

It has all sorts of bells and whistles for telling you how many tests are passing
and failing and it even will tell you that "yes, you have 100% coverage".

And then you try to run java8 in a docker container.

Oh well.

So - this one is like, the odd-kata-out. To make it work, you have to download
the internet.

## Stop downloading the internet:

I have made a folder in this repo that we use to cache all the downloaded
internet so it only happens once.

## Run the testing container, run the tests

`./run-kata.sh`

This will put you into a shell, where you can type "mvn test" ... and let the downlading
begin!

`mvn test`


