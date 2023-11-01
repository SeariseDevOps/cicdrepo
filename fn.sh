usermgt(){
  echo "Enter the username of the new user"
  read name 
  sudo adduser $name 
  echo "$name account is created successfully"
  tail -5 /etc/passwd
  grep $name /etc/passwd
  id $name  
}
filemgt(){
  if [ -e /etc/passwd ]
    then
    echo "It exist. Please procceed"
    grep wale /etc/passwd
    sudo touch app.java /home/searisetech 
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
}
packageMGT
db_backup
monitoring
