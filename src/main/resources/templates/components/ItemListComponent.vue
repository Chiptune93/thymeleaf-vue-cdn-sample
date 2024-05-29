<template>
  <div>
    <h2>Items</h2>
    <ul>
      <li v-for="item in items" :key="item">{{ item }}</li>
    </ul>
  </div>
</template>

<script>
export default {
  name: "ItemList",
  props: {
    items: {
      type: Array,
      required: true
    }
  }
};
</script>

<style scoped>
/* Optional: Add scoped styles here */
</style>
