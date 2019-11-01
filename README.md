# aws-lamda-cf-demo

Setup AWS cloud account

seup S3 repositoty through AWS console

Setup AWS SDK in local

Checkout the repository

execute mvn clean install to generate jar artifact

Navigate to \aws-lambda\cf-templates

Run below commands in command line

aws cloudformation package --template-file template-cf-dev.yaml --s3-bucket <aws-s3-bucket-name> --output-template-file lamdapoc-packaged-template-dev.yml

aws cloudformation deploy --template-file <File path of lamdapoc-packaged-template-dev.yml> --stack-name lamda-cf-poc-stack-dev --capabilities CAPABILITY_IAM
