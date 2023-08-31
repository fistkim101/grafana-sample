## actuator

https://docs.spring.io/spring-boot/docs/current/reference/htmlsingle/#actuator

<br>

## prometheus

```bash
docker run \
    --name prometheus-fsqd \
    -d -p 9090:9090 \
    -v /home/ec2-user/monitoring/prometheus.yml:/etc/prometheus/prometheus.yml \
    -v /home/ec2-user/monitoring/heap_memory_alert.yml:/etc/prometheus/heap_memory_alert.yml \
    -v /home/ec2-user/monitoring/high_cpu_alert.yml:/etc/prometheus/high_cpu_alert.yml \
    prom/prometheus
```

```bash
docker run -d \
  --name alertmanager-fsqd \
  -p 9093:9093 \
  -v /home/ec2-user/monitoring/alertmanager.yml:/etc/alertmanager/alertmanager.yml \
  prom/alertmanager
```

```bash
docker run \
    --name grafana-fsqd \
    -d -p 3000:3000 grafana/grafana-oss
```

<br>

## 
