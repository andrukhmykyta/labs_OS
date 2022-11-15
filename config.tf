provider "aws" {
    access_key = "AKIAZDE535SNARQ4LRMU"
    secret_key = "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"
    region = "eu-central-1"
}

resource "aws_instance" "shakhtar" {
    ami = "ami-06148e0e81e5187c8"
    instance_type = "t3.micro"
  
    tags = {
        Name = "Server"
        Owner = "Pan Mykyta"
        Project = "LabOS-4"
    }
}