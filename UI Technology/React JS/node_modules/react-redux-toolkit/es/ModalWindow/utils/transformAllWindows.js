/**
 * Copiying object and setting link to parent
 * @param {undefined} parent Must be undefined when you call function. This param is used only for recursion.
 */
const transformAllWindows = (allWindows, parent) => {
  if (allWindows && typeof allWindows.childs === 'object') {
    const keys = Object.keys(allWindows.childs);

    for (let i = 0; i < keys.length; i += 1) {
      const key = keys[i];
      // const child = { ...allWindows.childs[key] };
      const child = Object.assign(allWindows.childs[key]);
      allWindows.childs[key] = child;
      transformAllWindows(child, allWindows);
    }
  }
  allWindows.parent = parent;
  return allWindows;
};

export default transformAllWindows;
