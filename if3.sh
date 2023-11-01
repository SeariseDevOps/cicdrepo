# This script will authenticated a client with their valid pin
echo "Please enter your pin"
read pin
if [ $pin -eq 5470 ]
then
echo 'You entered a valid pin'
echo 'Welcome to TD, how can we help you today'
else
echo "Sorry, The pin you entered is invalid. Please contact a branch."
fi
