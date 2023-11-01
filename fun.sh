usermgt(){
  echo "Enter the username of the new user"
  read name 
  sudo adduser $name  
}
filemgt(){
  if [ -e /etc/passwd ]
    then
    echo "It exist. Please procceed"
    grep ope /etc/passwd
    sudo touch app.java /home/ope 
  else 
    echo "It doesn't exit"
  fi 
}
packageMGT(){
    sudo yum update -y
    sudo yum install tree vim nano unzip -y
    sudo systemctl stop httpd
    sudo systemctl status httpd
}
db_backup(){
    cp -r * /tmp/backup 
}
monitoring(){
    df -h 
    free -m
    top 
