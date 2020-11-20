elasticSearch {
    // see http://noamt.github.io/elasticsearch-grails-plugin/guide/configuration.html for defaults
    client.mode = "transport"
    client.hosts = [[host: "localhost", port: 9200]]
    datastoreImpl = "mongoDatastore"
    bulkIndexOnStartup = false
    migration.strategy = 'deleteIndex'
}
