FROM clojure
COPY . /usr/src/app
VOLUME /usr/src/app
WORKDIR /usr/src/app
EXPOSE 3000
CMD ["lein", "run"]


