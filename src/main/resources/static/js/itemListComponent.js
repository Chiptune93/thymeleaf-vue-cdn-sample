export default {
    props: ['items'],
    template: `
        <div>
            <h2>Items</h2>
            <ul>
                <li v-for="item in items" :key="item">{{ item }}</li>
            </ul>
        </div>
    `
};
