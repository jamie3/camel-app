# Simple Camel App

Receives order over HTTP, sends Amazon orders to WebSphere MQ, all other orders to a file folder

# Demo 1

curl -X POST -d @order-amazon.xml http://localhost:4000/order
curl -X POST -d @order-ebay.xml http://localhost:4000/order

# Demo 2

.to("mq:queue:ORDER.Q")

git add .
git commit
git log

# Demo 3

Management & Monitoring

http://localhost:8080/metrics


