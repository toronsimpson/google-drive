<template>

    <v-data-table
        :headers="headers"
        :items="notified"
        :items-per-page="5"
        class="elevation-1"
    ></v-data-table>

</template>

<script>
    const axios = require('axios').default;

    export default {
        name: 'NotifiedView',
        props: {
            value: Object,
            editMode: Boolean,
            isNew: Boolean
        },
        data: () => ({
            headers: [
                { text: "id", value: "id" },
            ],
            notified : [],
        }),
          async created() {
            var temp = await axios.get(axios.fixUrl('/notifieds'))

            temp.data._embedded.notifieds.map(obj => obj.id=obj._links.self.href.split("/")[obj._links.self.href.split("/").length - 1])

            this.notified = temp.data._embedded.notifieds;
        },
        methods: {
        }
    }
</script>

